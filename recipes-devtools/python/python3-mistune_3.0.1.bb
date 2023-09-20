
SUMMARY = "A sane and fast Markdown parser with useful plugins and renderers"
HOMEPAGE = "https://mistune.lepture.com/"
AUTHOR = " <Hsiaoming Yang <me@lepture.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7662a489238001edfceff24a3ce11cbd"

SRC_URI[sha256sum] = "e912116c13aa0944f9dc530db38eb88f6a77087ab128f49f84a48f4c05ea163c"

PYPI_PACKAGE = "mistune"

DEPENDS += "\
"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
"
