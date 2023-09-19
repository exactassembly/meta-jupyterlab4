SUMMARY = "The extensible, standards compliant build backend used by Hatch"
HOMEPAGE = "https://hatch.pypa.io/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbe2fd33fc9297692812fc94b7d27fd9"

inherit pypi python_hatchling

DEPENDS += "\
    python3-pluggy-native \
    python3-pathspec-native \
    python3-packaging-native \
    python3-editables-native \
    python3-trove-classifiers-native \
"
DEPENDS:remove:class-native = "python3-hatchling-native"

SRC_URI[sha256sum] = "76dee5108f929b7eb9102df0a1bf88fa3247d68a44ff1f395e1cf32eaab0c6fa"

do_compile:prepend() {
    export PYTHONPATH=src
}

BBCLASSEXTEND = "native nativesdk"
