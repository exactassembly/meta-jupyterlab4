SUMMARY = "Run a subprocess in a pseudo terminal"
HOMEPAGE = "https://github.com/pexpect/ptyprocess"
AUTHOR = "Thomas Kluyver <thomas@kluyver.me.uk>"
LICENSE = "ISCL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cfdcd51fa7d5808da4e74346ee394490"

SRC_URI[sha256sum] = "5c5d0a3b48ceee0b48485e0c26037c0acd7d29765ca3fbb5cb3831d347423220"

PYPI_PACKAGE = "ptyprocess"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"